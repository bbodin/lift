package opencl.executor;

public class GlobalArg extends KernelArg {
    public static native GlobalArg createInput(byte[] array);

    public static native GlobalArg createOutput(long size);

    GlobalArg(long handle) {
        super(handle);
    }

    public native float at(long index);

    public native float[] asFloatArray();
    public native int[] asIntArray();
    public native double[] asDoubleArray();
    public native boolean[] asBooleanArray();
    public native byte[] asByteArray();
}
