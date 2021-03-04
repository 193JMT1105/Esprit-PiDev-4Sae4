package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.WishList;

public interface WishList_Service_Impl {
	void addWishList(WishList w);
	void updateWishList(WishList w);
	WishList retrieveWishListById(Long idWishlist);
	List <WishList> retrieveAllWishLists();
	void deleteishList(WishList w);

}
