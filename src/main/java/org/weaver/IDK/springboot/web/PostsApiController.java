package org.weaver.IDK.springboot.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.weaver.IDK.springboot.service.posts.PostsService;
import org.weaver.IDK.springboot.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

	private final PostsService postsService;

	@PostMapping("/api/v1/posts")
	public Long save(@RequestBody PostsSaveRequestDto requestDto) {
		return postsService.save(requestDto);
	}
}
