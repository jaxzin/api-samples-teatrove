package com.espn.api.samples.teatrove;

/**
 * TODO: Add documentation for HeadlineImage
 */
public class HeadlineImage {
    
    public static class Builder {
        private String url, caption;
        public Builder url(String url) {
            this.url = url;
            return this;
        }
        
        public Builder caption(String caption) {
            this.caption = caption;
            return this;
        }
        
        public HeadlineImage build() {
            return new HeadlineImage(this);
        }
    }
    
    private String url;
    private String caption;

    private HeadlineImage(Builder builder) {
        this.url = builder.url;
        this.caption = builder.caption;
    }

    public String getUrl() {
        return url;
    }

    public String getCaption() {
        return caption;
    }
}
