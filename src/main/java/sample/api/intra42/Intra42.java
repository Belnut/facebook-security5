package sample.api.intra42;

import sample.api.ApiBinding;
import sample.api.facebook.Feed;
import sample.api.facebook.Post;
import sample.api.facebook.Profile;

import java.util.List;

public class Intra42 extends ApiBinding {
    private static final String GRAPH_API_BASE_URL = "https://graph.facebook.com/v2.12";

    public Intra42(String accessToken) {
        super(accessToken);
    }

    public Profile getProfile() {
        return restTemplate.getForObject(GRAPH_API_BASE_URL + "/me", Profile.class);
    }

    public List<Post> getFeed() {
        return restTemplate.getForObject(GRAPH_API_BASE_URL + "/me/feed", Feed.class).getData();

    }
}
