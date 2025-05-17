# Git and GitHub

## 一.Git 创建仓库提交修改

### 1.初始化一个Git仓库，使用`git init`命令。

> Git命令必须在Git仓库目录内执行（`git init`除外），在仓库目录外执行是没有意义的。

### 2.添加文件到Git仓库，分两步：

#### 	2.1使用命令`git add <file>`，注意，可反复多次使用，添加多个文件；

> 添加某个文件时，该文件必须在当前目录下存在，用`ls`或者`dir`命令查看当前目录的文件，看看文件是否存在，或者是否写错了文件名。

#### 	2.2使用命令`git commit -m <message>`，完成

> <message>为此次提交文件说明信息

### 3.查看当前仓库的状态

- 要随时掌握工作区的状态，使用`git status`命令。
- 如果`git status`告诉你有文件被修改过，用`git diff`可以查看修改内容。

## 二. Git 回退版本

### 1.`git log`命令显示从最近到最远的提交日志

​	用`git log`可以查看提交历史，以便确定要回退到哪个版本

> 如果嫌输出信息太多，看得眼花缭乱的，可以试试加上
>
> --pretty=oneline参数

### 2.使用get reset --hard commit_id 命令

```
版本号:
	在Git中，用HEAD表示当前版本，也就是最新的提交版本，上一个版本就是HEAD^，上上一个版本就是HEAD^^，当然往上100个版本写100个^比较容易数不过来，所以写成HEAD~100
```

> `--hard`参数有啥意义？
>
> `--hard`会回退到上个版本的已提交状态，而`--soft`会回退到上个版本的未提交状态，`--mixed`会回退到上个版本已添加但未提交的状态。

#### 	2.1 get reset --hard HEAD^ 回退到上一个版本

> 回退到上一个版本后,再次使用git log命令会发现,最新提交的那一个版本已经不在提交日志里面了,但是可以使用get reset -- hard 指定版本号就又可以达到最新提交的版本

#### 	2.2 get reset --hard  指定commit_id

​		可以回溯到指定的版本,版本号无需写全,系统会自动寻找

### 3.用`git reflog`查看命令历史，以便确定要回到未来的哪个版本

​		Git提供了一个命令`git reflog`用来记录你的每一次命令

## 三. 撤销修改

### 1.丢弃工作区修改

```
使用命令git checkout -- file,把file在工作区的所有修改全部撤销,有两种情况:

一种是file自修改后还没有被放到暂存区，现在，撤销修改就回到和版本库一模一样的状态；

一种是file已经添加到暂存区后，又作了修改，现在，撤销修改就回到添加到暂存区后的状态。
```

> git checkout 命令其实是将版本库里的版本替换掉工作区里的版本

### 2.丢弃暂存区修改

```
用命令git reset HEAD <file>可以把暂存区的修改撤销掉（unstage），重新放回工作区
```

### 3.丢弃版本库修改

```
已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节，不过前提是没有推送到远程库
```

### 4.删除文件

使用命令git rm file 删除一个文件,git commit -m <message> 后生效

> 从来没有被添加到版本库就被删除的文件，是无法恢复的！
>
> 如果一个文件已经被提交到版本库，那么你永远不用担心误删，但是要小心，你只能恢复文件到最新版本，你会丢失**最近一次提交后你修改的内容**。

## 四. 远程仓库

### 1.添加远程仓库

现在GitHub创建一个新的仓库(repository),然后在本地的learn仓库下输入以下命令

```bash
SSH连接:
$ git remote add origin git@github.com:ouyangxu66/learngit.git

或者:
HTTPS连接:
$ git remote add origin https://github.com/ouyangxu66/learngit.git
```

> origin为远程仓库名字

把本地库的内容推送到远程，用`git push`命令，实际上是把当前分支`master`推送到远程;而且从现在起只要本地仓库做了修改,用下面的git push命令就可以将本地最新的master分支推送到GitHub

首次推送到远程使用下面命令:

```bash
$ git push -u <remote name> master
```

后续的推送,自动关联到远程分支:

```bash
git push <remote name>
```

若希望未来所有新分支自动跟踪远程同名分支，可全局启用自动关联：

```bash
git config --global push.autoSetupRemote true
```

将已经拉取的远程仓库从HTTPS连接修改为SSH连接

```bash
git remote set-url origin git@github.com:ouyangxu66/learngit.git
```



### 2.删除远程仓库

使用下面命令可以查看当前远程仓库信息

```
$ git remote -v
```

然后,可以根据仓库名字删除,比如origin

```
$ git remote rm origin
```

此处的“删除”其实是解除了本地和远程的绑定关系，并不是物理上删除了远程库。远程库本身并没有任何改动。要真正删除远程库，需要登录到GitHub，在后台页面找到删除按钮再删除

### 3.克隆远程仓库

使用如下命令可以从GitHub中克隆远程仓库到本地

```bash
$ git clone git@github.com:ouyangxu66/gitskills.git
```

而后会在本地文件夹中生成一个子文件夹

如果要对克隆到本地的仓库进行操作需要先进入克隆后生成的子文件夹中,再运行Git命令

```bash
cd learngit

git branch
```



### 4.报错原因

因为防火墙限制,git push 和git clone会出现SSH报错

所以为了解决此问题,需要修改默认端口22

即在User目录下的.ssh中的config文件中,添加如下内容

```
Host github.com
    Hostname ssh.github.com
    Port 443
    User git
```

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250516180457672.png" alt="image-20250516180457672" style="zoom:150%;" />



## 五. 分支管理

### 1.创建与合并分支

查看分支：`git branch`

创建分支：`git branch <name>`

切换分支：`git checkout <name>`或者`git switch <name>`

创建+切换分支：`git checkout -b <name>`或者`git switch -c <name>`

合并某分支到当前分支：`git merge <name>`

删除分支：`git branch -d <name>`

强行删除分支:git branch -D <name>

> 每一个分支就是一个指针,每次创建一个分支就是创建一个指针,分支指向提交;HEAD指向的是当前分支.

### 2.解决冲突

当Git无法自动合并分支时，就必须首先解决冲突。解决冲突后，再提交，合并完成。

解决冲突就是把Git合并失败的文件手动编辑为我们希望的内容，再提交。

​			手动解决文件冲突

- 用编辑器（如 VS Code、Notepad++）打开冲突文件 `xxx.txt`。

- 文件中会有类似以下内容的**冲突标记**：

  ```
  <<<<<<< HEAD
  你的本地修改内容
  =======
  合并分支的修改内容
  >>>>>>> branch-name
  ```

- **手动编辑文件**，选择保留需要的部分（或合并两者），并删除所有冲突标记（`<<<<<<<`、`=======`、`>>>>>>>`）,删除所有冲突标记才算解决文件冲突

用`git log --graph`命令可以看到分支合并图。

分支策略:首先master分支应该是非常稳定的,仅用来发布新版本,不能做修改

​				  所以其他人的工作应该是再dev分支上修改工作,再将dev合并到master

> 合并分支时，加上`--no-ff`参数就可以用普通模式合并，合并后的历史有分支，能看出来曾经做过合并，而`fast forward`合并就看不出来曾经做过合并。

### 3.Bug分支

修复bug时，我们会通过创建新的bug分支进行修复，然后合并，最后删除；

当手头工作没有完成时，先把工作现场`git stash`一下，然后去修复bug，修复后，再`git stash pop`，回到工作现场；

> git stash 命令可以将当前工作现场存储起来,后续可以恢复现场后继续工作
>
> git stash list 命令可以查看保存的工作现场
>
> git stash apply 命令恢复现场后,stash中的内容并不会被删除,还需要使用git stash drop命令来删除
>
> git stash pop 命令可以在恢复的同时把stash内容也删了
>
> git stash apply stash@{0} 命令可以恢复指定的stash

在`master`分支上修复的bug，想要合并到当前`dev`分支，可以用`git cherry-pick <commit>`命令，把bug提交的修改“复制”到当前分支，避免重复劳动。

### 4.多人协作

因此，多人协作的工作模式通常是这样：

1. 首先，可以尝试用`git push origin <branch-name>`推送自己的修改；
2. 如果推送失败，则因为远程分支比你的本地更新，需要先用`git pull`试图合并；
3. 如果合并有冲突，则解决冲突，并在本地提交；
4. 没有冲突或者解决掉冲突后，再用`git push origin <branch-name>`推送就能成功！

如果`git pull`提示`no tracking information`，则说明本地分支和远程分支的链接关系没有创建，用

`git branch --set-upstream-to <branch-name> origin/<branch-name>`。

#### Rebase

rebase操作可以把本地未push的分叉提交历史整理成直线；

rebase的目的是使得我们在查看历史提交的变化时更容易，因为分叉的提交需要三方对比

## 六.标签管理

### 1.创建标签

- 命令`git tag <tagname>`用于新建一个标签，默认为`HEAD`，也可以指定一个commit id；

- 命令`git tag -a <tagname> -m "blablabla..."`可以指定标签信息；

- 命令`git tag`可以查看所有标签。

- 命令git show <tagname>可以查看标签的内容信息

  > 标签总是和某个commit挂钩。如果这个commit既出现在master分支，又出现在dev分支，那么在这两个分支上都可以看到这个标签。

### 2.删除标签

- 命令`git push origin <tagname>`可以推送一个本地标签；
- 命令`git push origin --tags`可以推送全部未推送过的本地标签；
- 命令`git tag -d <tagname>`可以删除一个本地标签；
- 命令`git push origin :refs/tags/<tagname>`可以删除一个远程标签。

> 如果要想已经推送删除远程仓库的标签,先要删除本地标签,然后再删除远程标签

## 七. 工作区和暂存区

### 工作区

```
就是你在电脑里能看到的目录，比如当前文件夹就是一个工作区
```

### 暂存区

```
工作区有一个隐藏目录.git，这个不算工作区，而是Git的版本库。

Git的版本库里存了很多东西，其中最重要的就是称为stage（或者叫index）的暂存区，还有Git为我们自动创建的第一个分支master，以及指向master的一个指针叫HEAD
```

### 原理

我们把文件往Git版本库里添加的时候，是分两步执行的：

​	第一步是用`git add`把文件添加进去，实际上就是把文件修改添加到暂存区；

​	第二步是用`git commit`提交更改，实际上就是把暂存区的所有内容提交到当前分支

注意

> 因为Git跟踪并管理的是修改，而非文件,所以每次修改，如果不用`git add`到暂存区，那就不会加入到`commit`中