package org.sp.services;

import org.sp.models.ImageContent;

public interface ImageLoader {
    ImageContent load(String url);
}
