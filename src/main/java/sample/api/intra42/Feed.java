package sample.api.intra42;

import lombok.Data;

import java.util.List;

@Data
public class Feed {
    List<Post> data;
}
