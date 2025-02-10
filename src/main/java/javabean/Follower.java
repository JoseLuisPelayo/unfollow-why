package javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode(of = "id")
public class Follower {
	private int id;
	private User user;
	private String followerUsername;
	private String platform;
	private boolean isFollowing;
}
