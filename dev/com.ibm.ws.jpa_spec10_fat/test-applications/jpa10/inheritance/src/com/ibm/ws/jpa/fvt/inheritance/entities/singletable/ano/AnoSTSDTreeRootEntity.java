/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.jpa.fvt.inheritance.entities.singletable.ano;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.ibm.ws.jpa.fvt.inheritance.entities.ITreeRoot;

@Entity
@Table(name = "AnoSTSDRoot")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISC_COL", discriminatorType = DiscriminatorType.STRING)
public abstract class AnoSTSDTreeRootEntity implements ITreeRoot {
    @Id
    private int id;

    private String name;

    public AnoSTSDTreeRootEntity() {
        super();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnoSTSDTreeRootEntity [id=" + id + ", name=" + name + "]";
    }
}