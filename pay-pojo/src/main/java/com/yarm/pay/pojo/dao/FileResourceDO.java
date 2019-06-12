package com.yarm.pay.pojo.dao;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/11
 * Time:14:48
 * Des:
 */
@Entity
@Table(name = "file_resource", schema = "pay", catalog = "")
public class FileResourceDO {
    private int id;
    private String fileId;
    private byte[] data;
    private String name;
    private long size;
    private String fileType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "file_id")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "data")
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "size")
    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Basic
    @Column(name = "file_type")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileResourceDO that = (FileResourceDO) o;
        return id == that.id &&
                size == that.size &&
                Objects.equals(fileId, that.fileId) &&
                Arrays.equals(data, that.data) &&
                Objects.equals(name, that.name) &&
                Objects.equals(fileType, that.fileType);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, fileId, name, size, fileType);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
}