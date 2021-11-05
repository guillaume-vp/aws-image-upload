package com.guillaume.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfil {
    

    private final UUID userProfileId;
    private final String userName;
    private String userProfileImageLink;


    public UserProfil(UUID userProfileId, String userName, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        this.userProfileImageLink = userProfileImageLink;
    }


    public UUID getUserProfileId() {
        return this.userProfileId;
    }

    public String getUserName() {
        return this.userName;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserProfil)) {
            return false;
        }
        UserProfil userProfil = (UserProfil) o;
        return Objects.equals(userProfileId, userProfil.userProfileId) && Objects.equals(userName, userProfil.userName) && Objects.equals(userProfileImageLink, userProfil.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, userName, userProfileImageLink);
    }


}
