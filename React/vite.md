# Vite: A Quick Overview

Vite, derived from the French word meaning "quick," is a modern build tool designed to enhance the development experience by providing faster performance. It consists of two major components:

1. **Development Server**: Offers rich feature enhancements over native ES modules.
2. **Build Command**: Bundles the code using Rollup, pre-configured to output highly optimized static assets for production.

## Starting a Vite Project

  To create a new Vite project, follow these steps:

  1. Create a new Vite app:
    ```
    npm create vite@latest vite-app -- --template react-ts
    ```
  (Use . if you want to create the project in the current folder)

  2. Navigate to the project directory:
    ```
    cd vite-app
    ```

  3. Install dependencies:
    ```
    npm install
    ```

  4. Start the development server:
    ```
    npm run dev
    ``

## Hot Module Replacement (HMR)

  Vite provides Hot Module Replacement (HMR) over native ES modules. Frameworks with HMR capabilities can leverage this API to deliver instant, precise updates without reloading the page or losing application state.

## TypeScript with Vite

  Vite performs transpilation on .ts files but does not conduct type checking. It assumes that type checking is managed by your IDE and build process, as these two tasks operate fundamentally differently.

## Integrating Tailwind CSS

  To integrate Tailwind CSS into your Vite project, follow these steps:

  1. Install Tailwind CSS and its dependencies:
    ```
    npm install -D tailwindcss postcss autoprefixer
    ```

  2. Initialize Tailwind CSS:
    ```
    npx tailwindcss init -p
    ```

  3. Update index.css:

    @tailwind base;
    @tailwind components;
    @tailwind utilities;

  4. Configure tailwind.config.cjs:
    ```
    module.exports = {
      content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
      // Other configurations
    };
    ```

## TypeScript Compiler Option: forceConsistentCasingInFileNames(Error i faced)

  The forceConsistentCasingInFileNames compiler option in TypeScript ensures that file references maintain the correct casing, which is crucial when working across different operating systems. For instance, on a case-sensitive file system (like Linux), "MyFile.ts" and "myfile.ts" are treated as different files, while on a case-insensitive file system (like Windows), they are considered the same.

  Resolving Casing Issues
  To enable this option, update your tsconfig.app.json file:
    ```
    {
      "compilerOptions": {
        "forceConsistentCasingInFileNames": true,
        // Other compiler options
      }
    }
    ```
  Alternatively, you can add this option to your project's main tsconfig.json file to apply it to all TypeScript files.

## Environment Variables in Vite

  Vite supports several types of environment variable files:

  1. .env: Loaded in all cases.
  2. .env.local: Loaded in all cases, ignored by Git.
  3. .env.[mode]: Loaded only in the specified mode.
  4. .env.[mode].local: Loaded only in the specified mode, ignored by Git.
  You can access environment variables using import.meta.env.SomeKey.

  If you create an .env.development.local file, the data will be visible in the browser.
  If you create an .env.production.local file, sensitive data will be hidden.

## Deployment

  To preview your Vite app on a custom port, add the following script in your package.json:
    ```
    "scripts": {
      "preview": "vite preview --port 8080"
    }
    ```
  You can then access your app at <https://127.0.0.1:8080>.

## Pushing Code to GitHub

  To push your code to GitHub, follow these commands:
    ```
    1. git init
    2. git remote add origin https://<link-to-your-repository>
    3. git branch -M main
    4. git add .
    5. git commit -m "Your commit message"
    6. git push -u origin main
    ```

## Hosting on Vercel

  To host your Vite project on Vercel:
  
  1. Create a new project on Vercel.
  2. Import your project from GitHub.
  3. Run the build command in the terminal:
    ```
    npm run build
    ```