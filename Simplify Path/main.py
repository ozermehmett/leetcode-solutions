class Solution:
    def simplifyPath(self, path: str) -> str:
        stack = []
        directories = path.split("/")

        for directory in directories:
            if directory == "..":
                if stack:
                    stack.pop()
            elif directory != "." and directory != "":
                stack.append(directory)

        return "/" + "/".join(stack)
