package com.weirdoc.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weirdoc.orderservice.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
