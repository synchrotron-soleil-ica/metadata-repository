package metadatarepo.core.moduleId;

/**
 * @author Gregory Boissinot
 */
public class NoModuleStatus implements ModuleStatus {

    @Override
    public void promote(ModuleMetaVersion moduleMetaVersion) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void release(ModuleMetaVersion moduleMetaVersion) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isDefault() {
        throw new UnsupportedOperationException();
    }
}
