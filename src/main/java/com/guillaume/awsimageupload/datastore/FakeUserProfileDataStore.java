package com.guillaume.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.guillaume.awsimageupload.profile.UserProfil;

import org.springframework.stereotype.Repository;

@Repository
public class FakeUserProfileDataStore {
    
    private static final List<UserProfil> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfil(UUID.fromString("a1f52904-80f5-4524-b841-acf9ccc507a8"), "Maria", null));
        USER_PROFILES.add(new UserProfil(UUID.fromString("a3ac0cdd-f755-4968-9227-c2ee9d957bcd"), "Paul", null));
        USER_PROFILES.add(new UserProfil(UUID.fromString("6940c2be-7bd8-42d6-b4d2-437fa8502c07"), "Jason", null));
    }

    public List<UserProfil> getUserProfiles(){
        return USER_PROFILES;
    }
 }
