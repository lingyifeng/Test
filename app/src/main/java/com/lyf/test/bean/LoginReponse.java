package com.lyf.test.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/4/11 0011.
 */

public class LoginReponse {

    /**
     * success : 1
     * msg : 登录成功
     * body : {"go":3,"user":{"id":447789,"domain":"zj.idaqi.com","type":4,"account":"15538307250","pwd":"e10adc3949ba59abbe56e057f20f883e","headImageUrl":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","name":"王雷雷","expert":{"id":2,"headimg_source":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","headimg_compress":"/iext/resource/imgs/expert/2017/3/750-750-3646.png","sex":1,"address":"朝阳区","le_goodat_group":"市场/产品规划,销售管理,研发技术管理,工艺工装夹模具管理,作业计划管理,采购供应链,信息流（ERP及MRP）","rgn_structcode":"中国,北京市,朝阳区"},"imaccount":"iext447789EXPT15538307253","impassword":"709c9db97e8bef08be95ffce798c0cde","expt":{"rgnid":7,"goodat":[{"labelid":8975,"content":"市场/产品规划"},{"labelid":8977,"content":"销售管理"},{"labelid":8979,"content":"研发技术管理"},{"labelid":8968,"content":"工艺工装夹模具管理"},{"labelid":8982,"content":"作业计划管理"},{"labelid":8966,"content":"采购供应链"},{"labelid":8978,"content":"信息流（ERP及MRP）"}],"sex":1,"intro":"","name":"王雷雷","headimg_source":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","agelimit":5,"age":2,"headimg_compress":"/iext/resource/imgs/expert/2017/3/750-750-3646.png","rgnname":"北京市朝阳区"}}}
     */
    @SerializedName("success")
    private int success;
    @SerializedName("msg")
    private String msg;
    @SerializedName("body")
    private BodyBean body;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class BodyBean {
        /**
         * go : 3
         * user : {"id":447789,"domain":"zj.idaqi.com","type":4,"account":"15538307250","pwd":"e10adc3949ba59abbe56e057f20f883e","headImageUrl":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","name":"王雷雷","expert":{"id":2,"headimg_source":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","headimg_compress":"/iext/resource/imgs/expert/2017/3/750-750-3646.png","sex":1,"address":"朝阳区","le_goodat_group":"市场/产品规划,销售管理,研发技术管理,工艺工装夹模具管理,作业计划管理,采购供应链,信息流（ERP及MRP）","rgn_structcode":"中国,北京市,朝阳区"},"imaccount":"iext447789EXPT15538307253","impassword":"709c9db97e8bef08be95ffce798c0cde","expt":{"rgnid":7,"goodat":[{"labelid":8975,"content":"市场/产品规划"},{"labelid":8977,"content":"销售管理"},{"labelid":8979,"content":"研发技术管理"},{"labelid":8968,"content":"工艺工装夹模具管理"},{"labelid":8982,"content":"作业计划管理"},{"labelid":8966,"content":"采购供应链"},{"labelid":8978,"content":"信息流（ERP及MRP）"}],"sex":1,"intro":"","name":"王雷雷","headimg_source":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","agelimit":5,"age":2,"headimg_compress":"/iext/resource/imgs/expert/2017/3/750-750-3646.png","rgnname":"北京市朝阳区"}}
         */
        @SerializedName("go")
        private int go;
        @SerializedName("user")
        private UserBean user;

        public int getGo() {
            return go;
        }

        public void setGo(int go) {
            this.go = go;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * id : 447789
             * domain : zj.idaqi.com
             * type : 4
             * account : 15538307250
             * pwd : e10adc3949ba59abbe56e057f20f883e
             * headImageUrl : /iext/resource/imgs/expert/2017/3/750-750-3645.png
             * name : 王雷雷
             * expert : {"id":2,"headimg_source":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","headimg_compress":"/iext/resource/imgs/expert/2017/3/750-750-3646.png","sex":1,"address":"朝阳区","le_goodat_group":"市场/产品规划,销售管理,研发技术管理,工艺工装夹模具管理,作业计划管理,采购供应链,信息流（ERP及MRP）","rgn_structcode":"中国,北京市,朝阳区"}
             * imaccount : iext447789EXPT15538307253
             * impassword : 709c9db97e8bef08be95ffce798c0cde
             * expt : {"rgnid":7,"goodat":[{"labelid":8975,"content":"市场/产品规划"},{"labelid":8977,"content":"销售管理"},{"labelid":8979,"content":"研发技术管理"},{"labelid":8968,"content":"工艺工装夹模具管理"},{"labelid":8982,"content":"作业计划管理"},{"labelid":8966,"content":"采购供应链"},{"labelid":8978,"content":"信息流（ERP及MRP）"}],"sex":1,"intro":"","name":"王雷雷","headimg_source":"/iext/resource/imgs/expert/2017/3/750-750-3645.png","agelimit":5,"age":2,"headimg_compress":"/iext/resource/imgs/expert/2017/3/750-750-3646.png","rgnname":"北京市朝阳区"}
             */

            private int id;
            private String domain;
            private int type;
            private String account;
            private String pwd;
            private String headImageUrl;
            private String name;
            private ExpertBean expert;
            private String imaccount;
            private String impassword;
            private ExptBean expt;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getDomain() {
                return domain;
            }

            public void setDomain(String domain) {
                this.domain = domain;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getPwd() {
                return pwd;
            }

            public void setPwd(String pwd) {
                this.pwd = pwd;
            }

            public String getHeadImageUrl() {
                return headImageUrl;
            }

            public void setHeadImageUrl(String headImageUrl) {
                this.headImageUrl = headImageUrl;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public ExpertBean getExpert() {
                return expert;
            }

            public void setExpert(ExpertBean expert) {
                this.expert = expert;
            }

            public String getImaccount() {
                return imaccount;
            }

            public void setImaccount(String imaccount) {
                this.imaccount = imaccount;
            }

            public String getImpassword() {
                return impassword;
            }

            public void setImpassword(String impassword) {
                this.impassword = impassword;
            }

            public ExptBean getExpt() {
                return expt;
            }

            public void setExpt(ExptBean expt) {
                this.expt = expt;
            }

            public static class ExpertBean {
                /**
                 * id : 2
                 * headimg_source : /iext/resource/imgs/expert/2017/3/750-750-3645.png
                 * headimg_compress : /iext/resource/imgs/expert/2017/3/750-750-3646.png
                 * sex : 1
                 * address : 朝阳区
                 * le_goodat_group : 市场/产品规划,销售管理,研发技术管理,工艺工装夹模具管理,作业计划管理,采购供应链,信息流（ERP及MRP）
                 * rgn_structcode : 中国,北京市,朝阳区
                 */

                private int id;
                private String headimg_source;
                private String headimg_compress;
                private int sex;
                private String address;
                private String le_goodat_group;
                private String rgn_structcode;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getHeadimg_source() {
                    return headimg_source;
                }

                public void setHeadimg_source(String headimg_source) {
                    this.headimg_source = headimg_source;
                }

                public String getHeadimg_compress() {
                    return headimg_compress;
                }

                public void setHeadimg_compress(String headimg_compress) {
                    this.headimg_compress = headimg_compress;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getLe_goodat_group() {
                    return le_goodat_group;
                }

                public void setLe_goodat_group(String le_goodat_group) {
                    this.le_goodat_group = le_goodat_group;
                }

                public String getRgn_structcode() {
                    return rgn_structcode;
                }

                public void setRgn_structcode(String rgn_structcode) {
                    this.rgn_structcode = rgn_structcode;
                }
            }

            public static class ExptBean {
                /**
                 * rgnid : 7
                 * goodat : [{"labelid":8975,"content":"市场/产品规划"},{"labelid":8977,"content":"销售管理"},{"labelid":8979,"content":"研发技术管理"},{"labelid":8968,"content":"工艺工装夹模具管理"},{"labelid":8982,"content":"作业计划管理"},{"labelid":8966,"content":"采购供应链"},{"labelid":8978,"content":"信息流（ERP及MRP）"}]
                 * sex : 1
                 * intro :
                 * name : 王雷雷
                 * headimg_source : /iext/resource/imgs/expert/2017/3/750-750-3645.png
                 * agelimit : 5
                 * age : 2
                 * headimg_compress : /iext/resource/imgs/expert/2017/3/750-750-3646.png
                 * rgnname : 北京市朝阳区
                 */

                private int rgnid;
                private int sex;
                private String intro;
                private String name;
                private String headimg_source;
                private int agelimit;
                private int age;
                private String headimg_compress;
                private String rgnname;
                private List<GoodatBean> goodat;

                public int getRgnid() {
                    return rgnid;
                }

                public void setRgnid(int rgnid) {
                    this.rgnid = rgnid;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public String getIntro() {
                    return intro;
                }

                public void setIntro(String intro) {
                    this.intro = intro;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getHeadimg_source() {
                    return headimg_source;
                }

                public void setHeadimg_source(String headimg_source) {
                    this.headimg_source = headimg_source;
                }

                public int getAgelimit() {
                    return agelimit;
                }

                public void setAgelimit(int agelimit) {
                    this.agelimit = agelimit;
                }

                public int getAge() {
                    return age;
                }

                public void setAge(int age) {
                    this.age = age;
                }

                public String getHeadimg_compress() {
                    return headimg_compress;
                }

                public void setHeadimg_compress(String headimg_compress) {
                    this.headimg_compress = headimg_compress;
                }

                public String getRgnname() {
                    return rgnname;
                }

                public void setRgnname(String rgnname) {
                    this.rgnname = rgnname;
                }

                public List<GoodatBean> getGoodat() {
                    return goodat;
                }

                public void setGoodat(List<GoodatBean> goodat) {
                    this.goodat = goodat;
                }

                public static class GoodatBean {
                    /**
                     * labelid : 8975
                     * content : 市场/产品规划
                     */

                    private int labelid;
                    private String content;

                    public int getLabelid() {
                        return labelid;
                    }

                    public void setLabelid(int labelid) {
                        this.labelid = labelid;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }
                }
            }
        }
    }
}
