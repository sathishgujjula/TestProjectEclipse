package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.PostRepository;

@SpringBootApplication
public class SpringbootHibernateOneToOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToOneApplication.class, args);
	}

    @Autowired
	private CommentRepository commentRepository;
	
    @Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {


		Post pos = new Post("One to many mapping jpa", "one to many mapping jpa");
		Post pos1 = new Post("One to many", "One to many");
		
		Comment comm1 = new Comment("Very Useful");
		Comment comm2 = new Comment("Informative");
		Comment comm3 = new Comment("Great Post");
		
		Comment comm11 = new Comment("Good");
		Comment comm22 = new Comment("Nice");
		Comment comm33 = new Comment("Not bad");
		
	
		
		pos.getComment().add(comm1);
		pos.getComment().add(comm2);
		pos.getComment().add(comm3);
		
		pos1.getComment().add(comm11);
		pos1.getComment().add(comm22);
		pos1.getComment().add(comm33);
		
	this.postRepository.save(pos);
	this.postRepository.save(pos1);
      
	}

}
