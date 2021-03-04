package tn.esprit.spring.restController;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.WishList;
import tn.esprit.spring.service.WisList_Service;



@RestController
@RequestMapping("/wishList")
public class WishListRestController {
@Autowired
WisList_Service wisher;


@PostMapping("/addWish")
public void addWish(@RequestBody  WishList wish)
{
	wisher.addWishList(wish);	
}
@GetMapping("/retrieveAllWishLists")
public List<WishList> retrieveAllWishLists()
{
	return wisher.retrieveAllWishLists();
}

@PutMapping("/updateWishList")
public void updateUser(@RequestBody  WishList wish)
{
	wisher.updateWishList(wish);
}
@GetMapping("/retrieveWishListById/{id}")
public void retrieveWishListById(@PathParam("id") Long id)
{
	wisher.retrieveWishListById(id);
}
@DeleteMapping("/deleteWishList")
public void deleteBank(@RequestBody WishList wish)
{
	wisher.deleteishList(wish); 
}



}
