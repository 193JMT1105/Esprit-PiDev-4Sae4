package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.User;

public interface Bank_Service_Impl {
	void addBank(Bank ban);
	void updateBank(Bank ban);
	Bank retrieveBankById(Long idBank);
	List <Bank> retrieveAllBanks();
	void deleteBank(Bank ban);
	Bank getBankByidBank(Long idBank);

}
