package kg.megacom.mega24.services;

import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

public interface FileService {

    String saveFile(MultipartFile multipartFile, String phoneNumber);
}
