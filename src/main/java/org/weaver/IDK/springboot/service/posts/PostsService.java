package org.weaver.IDK.springboot.service.posts;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.weaver.IDK.springboot.domain.posts.PostsRepository;
import org.weaver.IDK.springboot.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostsService {
	private final PostsRepository postsRepository;

	@Transactional
	public Long save(PostsSaveRequestDto requestDto) {
		/*
		 여기서 toEntity()는 PostsSaveRequestDto로 받은 객체를 Posts 객체로 바꿔주는 역할인가?
		 Yes. 왜냐하면 서비스 로직에서 바로 DB에 저장하는 것이 아니라 Entity 클래스를 통해서 DB에 접근해야 하므로
		 Entity로 바꾸어주는 메서드가 필요함.
		 */
		return postsRepository.save(requestDto.toEntity()).getId();
	}
}
