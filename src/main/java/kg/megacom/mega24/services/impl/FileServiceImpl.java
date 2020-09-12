package kg.megacom.mega24.services.impl;

import kg.megacom.mega24.services.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileServiceImpl implements FileService {


        @Value("${img.path}")
        private String dirPath;

               @Override
             public String saveFile(MultipartFile multipartFile, String phoneNumber) {
            Path path= Paths.get(dirPath+"/"+phoneNumber);
            if (!Files.exists(path)){
                try {
                    Files.createDirectories(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            path=Paths.get(path+"/"+multipartFile.getName());


            try {
                Files.write(path, multipartFile.getBytes());
                System.out.println(Files.getFileStore(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return String.valueOf(path);

        }
    }

