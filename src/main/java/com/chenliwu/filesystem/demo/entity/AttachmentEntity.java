package com.chenliwu.filesystem.demo.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("Attachment")
public class AttachmentEntity {
    /**
     * 文件编号，自动增长列
     */
    @TableField("FILE_NO")
    private Long fileNo;

    /**
     * 文件的具体类型
     */
    @TableField("FILE_TYPE")
    private String fileType;

    /**
     * 文件名称
     */
    @TableField("FILE_NAME")
    private String fileName;

    /**
     * 文件路径，相对路径
     */
    @TableField("FILE_PATH")
    private String filePath;

    /**
     * 存储类型，0：本地文件存储
     */
    @TableField("STORAGE_TYPE")
    private Byte storageType;

    /**
     * 文件大小，单位Byte
     */
    @TableField("LENGTH")
    private Integer length;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 创建者ID
     */
    @TableField("CREATE_BY")
    private String createBy;

    /**
     * 修改时间
     */
    @TableField("UPDATE_TIME")
    private Date updateTime;

    /**
     * 修改者ID
     */
    @TableField("UPDATE_BY")
    private String updateBy;

    /**
     * 文件编号，自动增长列
     * @return FILE_NO 文件编号，自动增长列
     */
    public Long getFileNo() {
        return fileNo;
    }

    /**
     * 文件编号，自动增长列
     * @param fileNo 文件编号，自动增长列
     */
    public void setFileNo(Long fileNo) {
        this.fileNo = fileNo;
    }

    /**
     * 文件的具体类型
     * @return FILE_TYPE 文件的具体类型
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 文件的具体类型
     * @param fileType 文件的具体类型
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * 文件名称
     * @return FILE_NAME 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 文件名称
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 文件路径，相对路径
     * @return FILE_PATH 文件路径，相对路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 文件路径，相对路径
     * @param filePath 文件路径，相对路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * 存储类型，0：本地文件存储
     * @return STORAGE_TYPE 存储类型，0：本地文件存储
     */
    public Byte getStorageType() {
        return storageType;
    }

    /**
     * 存储类型，0：本地文件存储
     * @param storageType 存储类型，0：本地文件存储
     */
    public void setStorageType(Byte storageType) {
        this.storageType = storageType;
    }

    /**
     * 文件大小，单位Byte
     * @return LENGTH 文件大小，单位Byte
     */
    public Integer getLength() {
        return length;
    }

    /**
     * 文件大小，单位Byte
     * @param length 文件大小，单位Byte
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建者ID
     * @return CREATE_BY 创建者ID
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者ID
     * @param createBy 创建者ID
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 修改时间
     * @return UPDATE_TIME 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 修改者ID
     * @return UPDATE_BY 修改者ID
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改者ID
     * @param updateBy 修改者ID
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}