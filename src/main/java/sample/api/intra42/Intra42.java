package sample.api.intra42;

import sample.api.ApiBinding;

import java.util.List;

public class Intra42 extends ApiBinding {
    private static final String GRAPH_API_BASE_URL = "https://api.intra.42.fr/v2";

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
