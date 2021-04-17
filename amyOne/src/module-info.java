import com.ssx03.MyService;
import com.ssx03.impl.Czxy;
import com.ssx03.impl.Itheima;

module amyOne {
    exports com.ssx01;
    exports com.ssx03;

    provides MyService with Czxy;
}