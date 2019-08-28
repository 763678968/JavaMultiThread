//
//public class VolatileOrderingDemo {
//    private int dataA = 0;
//    private long dataB = 0L;
//    private String dataC = null;
//    private volatile boolean ready = false;
//
//    @Actor
//    public void writer() {
//        dataA = 1;
//        dataB = 10000L;
//        dataC = "Content...";
//        ready = true;
//    }
//
//    @Observer({
//            @Expect(desc = "Normal")
//    })
//    public int reader() {
//        int result = 0;
//        boolean allISOK;
//        if (ready) {
//            allISOK = (1 == dataA) && (10000L == dataB) && "Content...".equals(dataC);
//            result = allISOK ? 1 : 2;
//        } else {
//            result = 3;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//
//        // 调用测试工具运行测试代码
//        TestRunner.runTest(VolatileOrderingDemo.class);
//    }
//}
