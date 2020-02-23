package comp;
class CpuNotFoundException extends RuntimeException {

    CpuNotFoundException(int id) {
        super("Could not find cpu " + id);
    }
}