package com.qax.hello.Dao;

import com.qax.hello.po.Poem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author yexuman
 * @date 2019/10/24 20:51
 */
public interface PoemRepository extends ElasticsearchRepository<Poem,Long> {
}
