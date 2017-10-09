package com.github.chiby.store.model.repositories;

import com.github.chiby.player.model.Playlist;
import com.github.chiby.player.model.User;

public interface PlaylistRepositoryCustom {
	public Playlist findOneByNameAndUser(String name, User user);
}