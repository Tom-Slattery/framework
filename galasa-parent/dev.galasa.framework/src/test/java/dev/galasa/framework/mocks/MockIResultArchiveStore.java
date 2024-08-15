/*
 * Copyright contributors to the Galasa project
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package dev.galasa.framework.mocks;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import dev.galasa.framework.spi.IResultArchiveStore;
import dev.galasa.framework.spi.IResultArchiveStoreDirectoryService;
import dev.galasa.framework.spi.ResultArchiveStoreException;
import dev.galasa.framework.spi.teststructure.TestStructure;
import static org.assertj.core.api.Assertions.*;


public class MockIResultArchiveStore implements IResultArchiveStore {

    List<TestStructure> testStructureHistory = new ArrayList<>();
    private String runId ;

    public MockIResultArchiveStore(String runId) {
        this.runId = runId;
    }

    @Override
    public void updateTestStructure(@NotNull TestStructure testStructure) throws ResultArchiveStoreException {
        assertThat(testStructure).isNotNull();
        testStructureHistory.add(testStructure);
    }

    @Override
    public String calculateRasRunId() {
        return this.runId;
    }

    public List<TestStructure> getTestStructureHistory() {
        return this.testStructureHistory;
    }

    @Override
    public void flush() {
        // Do nothing.
    }

    // --------------- un-implemented methods follow --------------------

    @Override
    public void writeLog(@NotNull String message) throws ResultArchiveStoreException {
               throw new UnsupportedOperationException("Unimplemented method 'writeLog'");
    }

    @Override
    public void writeLog(@NotNull List<String> messages) throws ResultArchiveStoreException {
               throw new UnsupportedOperationException("Unimplemented method 'writeLog'");
    }

    @Override
    public Path getStoredArtifactsRoot() {
               throw new UnsupportedOperationException("Unimplemented method 'getStoredArtifactsRoot'");
    }



    @Override
    public void shutdown() {
               throw new UnsupportedOperationException("Unimplemented method 'shutdown'");
    }

    @Override
    public @NotNull List<IResultArchiveStoreDirectoryService> getDirectoryServices() {
               throw new UnsupportedOperationException("Unimplemented method 'getDirectoryServices'");
    }

}
