package com.example.portsandadapters.domain.contract;

import com.example.portsandadapters.domain.contract.utils.RandomUtil;

public abstract class IdentifiedObject {

  private static final int KEYLENGTH = 50;

  protected final String objectIdentifier;

  protected final Long databaseId;

  protected final Boolean objectIsPersisted;

  protected IdentifiedObject(Long databaseId, String identityPreviousObjectToBeRestored) {

    if (identityPreviousObjectToBeRestored == null) {
      objectIdentifier = RandomUtil.generateRandomString(KEYLENGTH);
    } else {
      objectIdentifier = identityPreviousObjectToBeRestored;
    }

    if (databaseId == null) {
      this.databaseId = null;
      this.objectIsPersisted = false;
    } else {
      this.databaseId = databaseId;
      this.objectIsPersisted = true;
    }
  }

  public Long getDatabaseId() {
    return databaseId;
  }

  public Boolean getObjectIsPersisted() {

    return objectIsPersisted;
  }
}
