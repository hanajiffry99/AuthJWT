package com.test.reddin.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Data
@Entity
@Table(name="post")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Post {
    //primary key
    @Id
    //automatically generate
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @NotBlank(message = "Post name cannot be empty or null")
    private String postName;
    //can be null sometimes
    @Nullable
    private String url;
    @Nullable
    //store as large object
    @Lob
    private String description;
    private Integer voteCount=0;
    //relationship between entities and as many posts are there for a user we use lazy loading
    //if we use eager loading all the posts will be loaded
    @ManyToOne(fetch = FetchType.LAZY)
    //name of fk in post entity, pk of user as referencedcolumnname
    //creates a foreignkey
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;
    //Instant represent the specific time instant on the current timeline.
    private Instant createdTime;
    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private SubReddit subreddit;
}
