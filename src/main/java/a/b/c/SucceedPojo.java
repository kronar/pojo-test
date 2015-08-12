package a.b.c;

import annotations.Pojo;
import com.google.common.base.Objects;

/**
 * Created by nikita on 10.08.15.
 */
@Pojo
public class SucceedPojo {

    private int a;
    private String b;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SucceedPojo that = (SucceedPojo) o;
        return Objects.equal(a, that.a) &&
                Objects.equal(b, that.b);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a, b);
    }

    @Override
    public String toString() {
        return "a.b.c.SucceedPojo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
