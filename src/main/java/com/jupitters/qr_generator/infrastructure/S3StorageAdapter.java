package com.jupitters.qr_generator.infrastructure;

import com.jupitters.qr_generator.ports.StoragePort;
import org.springframework.beans.factory.annotation.Value;
import software.amazon.awssdk.services.s3.S3Client;

public class S3StorageAdapter implements StoragePort {
    private final S3Client s3Client;
    private final String bucketName;
    private final String region;

    public S3StorageAdapter(S3Client s3Client, @Value("${aws.s3.bucket-name}") String bucketName, @Value("${aws.s3.region}") String region) {
        this.s3Client = s3Client;
        this.bucketName = bucketName;
        this.region = region;
    }

    @Override
    public String uploadFile(byte[] fileData, String fileName, String contentType) {
        return "";
    }
}
