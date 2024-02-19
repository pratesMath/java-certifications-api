package br.com.pratesmath.javacertificationsapi.modules.useCases;

import org.springframework.stereotype.Service;

import br.com.pratesmath.javacertificationsapi.modules.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("pratesmath@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}