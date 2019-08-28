///**
// * 基于双重检查锁定的错误单例模式实现
// */
//public class IncorrectDCLSingleton {
//    // 保存该类的唯一实例
//    private static IncorrectDCLSingleton instance = null;
//
//    // 省略实例变量声明
//    /**
//     * 私有构造器使其他类无法直接通过new创建该类的示例
//     */
//    private IncorrectDCLSingleton() {
//        // 什么也不做
//    }
//
//    /**
//     * 创建并返回该类的唯一实例
//     * 即只有该方法被调用时该类的唯一实例才会被创建
//     * @return
//     */
//    public static IncorrectDCLSingleton getInstance() {
//        if (null == instance) { // 操作①，第1次检查
//            synchronized (IncorrectDCLSingleton.class) {
//                if (null = instance) { // 操作②，第2次检查
//                    instance = new IncorrectDCLSingleton(); // 操作③
//                }
//            }
//        }
//        return instance;
//    }
//
//    public void someService() {
//        // 省略其他代码
//    }
//}
