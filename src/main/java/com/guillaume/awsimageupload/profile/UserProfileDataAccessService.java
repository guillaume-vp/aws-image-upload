package com.guillaume.awsimageupload.profile;

import java.util.List;

import com.guillaume.awsimageupload.datastore.FakeUserProfileDataStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserProfileDataAccessService {
    
    private final FakeUserProfileDataStore fakeUserProfileDataStore;


    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
        this.fakeUserProfileDataStore = fakeUserProfileDataStore;
    }

    List<UserProfil> getUserProfiles(){
        return fakeUserProfileDataStore.getUserProfiles();
    }
    
}
