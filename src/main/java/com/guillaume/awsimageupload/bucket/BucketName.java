package com.guillaume.awsimageupload.bucket;

public enum BucketName {
    
    PROFILE_IMAGE("guillaumevp-image-upload");

    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
