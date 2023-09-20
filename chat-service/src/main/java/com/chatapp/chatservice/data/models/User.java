package com.chatapp.chatservice.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public record User (@Id String id, String username, String name, String surname) {
}