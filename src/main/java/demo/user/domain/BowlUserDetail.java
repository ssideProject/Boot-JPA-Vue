package demo.user.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class BowlUserDetail implements UserDetails{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BowlUser user;
	
	public BowlUserDetail(BowlUser user) {
		this.user = user;
	}
	
	public BowlUser getUser() {
		return user;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("ROLE_"+this.user.getRoleName().name());
	}

	@Override
	public String getPassword() {
		return this.user.getPasswd();
	}

	@Override
	public String getUsername() {
		return this.user.getUserId();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true; // 이하 계정의 사용기간 만료나 계정 장금, 비밀번호 유효기간 만료나 계정 비활성화 같은 속성은 사용하지 않으므로 TRUE로 설정한다.
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
