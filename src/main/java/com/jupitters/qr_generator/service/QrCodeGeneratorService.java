package com.jupitters.qr_generator.service;

import com.jupitters.qr_generator.ports.StoragePort;
import org.springframework.stereotype.Service;

@Service
public class QrCodeGeneratorService {
    private final StoragePort storage;

    public QrCodeGeneratorService(StoragePort storage) {
        this.storage = storage;
    }


}
