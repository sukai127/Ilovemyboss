package iloveyouboss;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfileTest {

    private Profile profile;
    private Criteria criteria;
    private Answer answer;
    private Question question;
    private Criterion criterion;

    @Before
    public void setUp() throws Exception {
        question = new BooleanQuestion(1, "1+1=2?");
        answer = new Answer(question, "Yes");
        profile = new Profile("test");
        criteria = new Criteria();
    }

    @Test(expected = NullPointerException.class)
    public void should_throw_exception_when_criteria_is_null() throws Exception {
        profile.matches(null);
    }

    @Test
    public void should_return_false_when_criteria_size_is_0() throws Exception {
        boolean matches = profile.matches(criteria);
        assertThat(matches,is(false));
    }
}