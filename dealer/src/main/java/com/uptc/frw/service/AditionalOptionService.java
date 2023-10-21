package com.uptc.frw.service;

import com.uptc.frw.jpa.entity.AditionalOption;
import com.uptc.frw.jpa.repository.AditionalOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AditionalOptionService {
    @Autowired
    private AditionalOptionRepository aditionalOptionRepository;

    public List<AditionalOption> findAllAditionalOption(){
        return aditionalOptionRepository.findAll();
    }

    public AditionalOption saveAditionalOption(AditionalOption aditionalOption){
        return aditionalOptionRepository.save(aditionalOption);
    }

    public AditionalOption findAditionalOption(Long id){
        return aditionalOptionRepository.findById(id).get();
    }

    public void deleteAditionalOption(Long id){
        aditionalOptionRepository.deleteById(id);
    }

    public AditionalOption updatePriceOption(Long id,Double priceOption){
        AditionalOption aditionalOption = findAditionalOption(id);
        aditionalOption.setPriceOption(priceOption);
        return saveAditionalOption(aditionalOption);
    }
}
