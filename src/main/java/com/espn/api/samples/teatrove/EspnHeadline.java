package com.espn.api.samples.teatrove;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Add documentation for EspnHeadline
 */
public class EspnHeadline {
    
    public static class Builder {
        private String webUrl;
        private List<HeadlineImage> images = new ArrayList<HeadlineImage>();
        private String title;
        
        public Builder webUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        
        public Builder addImage(HeadlineImage image) {
            this.images.add(image);
            return this;
        }
        
        public EspnHeadline build() {
            return new EspnHeadline(this);
        }
    }
    
    private String webUrl;
    private List<HeadlineImage> images;
    private String title;

    private EspnHeadline(Builder builder) {
        this.webUrl = builder.webUrl;
        this.images = builder.images;
        this.title = builder.title;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public List<HeadlineImage> getImages() {
        return images;
    }

    public String getTitle() {
        return title;
    }
}
