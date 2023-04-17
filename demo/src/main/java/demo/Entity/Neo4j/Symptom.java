package demo.Entity.Neo4j;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.io.Serializable;

@Data
@Node("Symptom")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Symptom implements Serializable {

    @Id
    @GeneratedValue //设置主键自增
    private Long id;

    @Property("name")
    private String name;
}