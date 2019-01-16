package demo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import demo.user.domain.BowlUser;
import demo.user.domain.BowlUserDetail;
import demo.user.repository.BowlUserRepository;

public class BowlUserService implements UserDetailsService{
	
	@Autowired
	BowlUserRepository bowlUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//BowlUser user = bowlUserRepository.findOne(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + " is not found.");
		}
		return new BowlUserDetail(user);
	}
}
