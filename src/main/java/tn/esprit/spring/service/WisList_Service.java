package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.WishList;
import tn.esprit.spring.repository.WishListRepository;
@Service
public class WisList_Service implements WishList_Service_Impl {
	@Autowired
	WishListRepository wishrep;

	@Override
	public void addWishList(WishList w) {
		// TODO Auto-generated method stub
		wishrep.save(w);
	}

	@Override
	public void updateWishList(WishList w) {
		// TODO Auto-generated method stub
		wishrep.save(w);

	}

	@Override
	public WishList retrieveWishListById(Long idWishlist) {
		// TODO Auto-generated method stub
		return wishrep.findById(idWishlist).get();
	}

	@Override
	public List<WishList> retrieveAllWishLists() {
		// TODO Auto-generated method stub
		return (List<WishList>)wishrep.findAll();
	}

	@Override
	public void deleteishList(WishList w) {
		// TODO Auto-generated method stub
		wishrep.delete(w);
		
	}

}
