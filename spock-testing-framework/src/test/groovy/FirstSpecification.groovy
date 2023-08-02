import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

class FirstSpecification extends Specification {
    @Autowired private MockMvc mockMvc;
    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "check multiplication of  2 numbers"(int a, int b, int c) {
        expect:
        a + b == c
        where:
        a | b | c
        1 | 1 | 2
        4 | 5 | 10
    }

    def "Dividing an even number by 2 should result to zero"() {

    given :
    int a = 12;
    int b = 2;
    when :
    def c = a % b;
    then :
    c == 0
}
    def "multiply-API should be able to multiply two numbers " (){
        given :
        int a=4; int  b=5;
        when:
        MvcResult mvcResult =mockMvc.perform (MockMvcRequestBuilders.post("/multiply").param(4,5)).andReturn();
        then:
        20==mvcResult.response();
    }
}
