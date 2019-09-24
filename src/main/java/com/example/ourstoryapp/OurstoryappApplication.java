package com.example.ourstoryapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ourstoryapp.da.CommentRepository;
import com.example.ourstoryapp.da.LikesRepository;
import com.example.ourstoryapp.da.MemoryRepository;
import com.example.ourstoryapp.da.StoryRepository;
import com.example.ourstoryapp.da.TagRepository;
import com.example.ourstoryapp.da.UserRepository;
import com.example.ourstoryapp.web.CommentController;
import com.example.ourstoryapp.web.MemoryController;
import com.example.ourstoryapp.web.UserController;

@SpringBootApplication
public class OurstoryappApplication {
	// test 2
	// test
	@Autowired
	private StoryRepository story_repository;
	@Autowired
	private MemoryRepository memory_repository;
	@Autowired
	private UserRepository user_repository;
	@Autowired
	private CommentRepository comment_repository;
	@Autowired
	private LikesRepository likes_repository;
	@Autowired
	private TagRepository tag_repository;
	@Autowired
	private MemoryController memoryController;

	
	@Autowired
	private UserController uc;

//	private static final Logger logger = LoggerFactory.getLogger(OurstoryappApplication.class);
//	Logger log = LogManager.getLogger(LoggingController.class);

	public static void main(String[] args) {
		SpringApplication.run(OurstoryappApplication.class, args);

		// test
		// logger.info("Hello Spring Boot");
		

		
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			
			
//			for (User u: user_repository.findAll())
//			{
//				if (u.getPassword() != null && u.getPassword().length()<=15)
//				uc.update(u.getUser_id(), u.getPassword());
//			}
			// Place your code here

			// Memory m1 = new Memory(1,"Memory one is the first picture I have of
			// him",d1,null);
			// Comment c1 = new Comment(m1,d2,"I don't know him but, Rest in peace");

//			memory_repository.save(m1);
//			comment_repository.save(c1);

			// Like l2 = new Like(new User());

			// setlikes.add(l2);

//			Memory m1 = new Memory(1,"sakdjkalsdj",d1);
//			memory_repository.save(m1);
			// Like l1 = new Like(true,new User());
			// Set<Like> setlikes = new HashSet<>();
			// setlikes.add(l1);
			// m1.setLikes(setlikes);

			// like_repository.save(l1);
//			User u = new User();
//			user_repository.s	ave(u);
//
//			Story s = new Story(u, "fadi", new Date(), new Date(), null);
//			story_repository.save(s);

//			Memory memory = new Memory();
//			List<String> pictures = new ArrayList<>();
//			List<String> videos = new ArrayList<>();
//			List<String> tags = new ArrayList<>();
//			pictures.add("www.google1.com");
//			pictures.add("www.google2.com");
//			pictures.add("www.google3.com");
//			videos.add("www.google1.com");
//			videos.add("www.google2.com");
//			tags.add("happy");
//			tags.add("fun");
//			memoryController.createMemory(memory, pictures, videos, tags);
//			Optional<Memory> memory = memory_repository.findById((long) 76);
//			Set<Tag> tags = new HashSet<>();
//			comment_repository.save(new Comment(memory.get(), user_repository.findById((long) 3).get(), tags,
//					new Date(), "Great Memory!"));
//			List<String> pictures = new ArrayList<>();
//			List<String> videos = new ArrayList<>();
//			List<String> tags = new ArrayList<>();
//			pictures.add("www.google1.com");
//			pictures.add("www.google2.com");
//			pictures.add("www.google3.com");
//			videos.add("www.google1.com");
//			videos.add("www.google2.com");
//			memoryController.addMediaToMemory(60, pictures, videos, tags);
		};
	}

}
