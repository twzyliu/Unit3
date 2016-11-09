import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by zyongliu on 09/11/16.
 */
public class LongthTest {

    public static final Unit M = Unit.M;
    public static final Unit CM = Unit.CM;

    @Test
    public void should_return_true_when_equal_with_same_amount_and_same_unit() throws Exception {
        assertThat(new Longth(1, M).equal(new Longth(1, M)), is(true));
    }

    @Test
    public void should_return_false_when_equal_with_same_amount_and_different_unit() throws Exception {
        assertThat(new Longth(1, M).equal(new Longth(1, CM)), is(false));
    }

    @Test
    public void should_return_false_when_equal_with_different_amount_and_same_unit() throws Exception {
        assertThat(new Longth(1, M).equal(new Longth(2, CM)), is(false));
    }

    @Test
    public void should_return_true_when_equal_with_1M_and_100CM() throws Exception {
        assertThat(new Longth(1, M).equal(new Longth(100, CM)), is(true));
    }
}
