package kg.itAcademy.factory.service;

import kg.itAcademy.factory.dto.Logs;
import kg.itAcademy.factory.repository.LogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LogsServiceImpl implements LogsService{
    @Autowired
    private LogsRepository logsRepository;

    @Override
    public Logs save(String code) {
        Logs logs = new Logs();
        logs.setCode(code);
        logs.setRequestDate(LocalDateTime.now());
        return logsRepository.save(logs);
    }
}
