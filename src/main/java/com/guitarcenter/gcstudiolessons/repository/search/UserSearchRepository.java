package com.guitarcenter.gcstudiolessons.repository.search;

import com.guitarcenter.gcstudiolessons.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
