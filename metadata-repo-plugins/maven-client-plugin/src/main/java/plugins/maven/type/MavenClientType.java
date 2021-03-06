package plugins.maven.type;

import metadatarepo.core.version.deps.strategy.DependencyVersionStrategy;
import plugins.maven.pomparent.version.POMParentVersion;

/**
 * @author Gregory Boissinot
 */
public interface MavenClientType {
    DependencyVersionStrategy getDependencyVersionStrategy();

    POMParentVersion getLatestBOMVersion();

    POMParentVersion fixParentVersion(String version);
}
