package ru.sntc4.WebBlog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.sntc4.WebBlog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
